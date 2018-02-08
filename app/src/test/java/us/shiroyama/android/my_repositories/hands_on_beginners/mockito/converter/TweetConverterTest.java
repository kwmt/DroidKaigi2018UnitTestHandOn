package us.shiroyama.android.my_repositories.hands_on_beginners.mockito.converter;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import us.shiroyama.android.my_repositories.hands_on_beginners.mockito.entity.Tweet;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Local Unit Test for {@link TweetConverter}
 *
 * @author Fumihiko Shiroyama
 */

public class TweetConverterTest {
  private TweetConverter converter;

  @Before
  public void setUp() throws Exception {
    converter = new TweetConverter();
  }

  /**
   * {@link Tweet} を {@link String} に正しく変換できることを検証するテストケースを書こう。
   */
  @Test
  public void convert() throws Exception {
    String expect = "test";
    String actual = converter.convert(Tweet.bodyOf(expect));
    assertThat(actual).isEqualTo(expect);
  }

  /**
   * {@link Tweet#body} が空の場合に変換結果が空文字列であることを検証するテストケースを書こう。
   */
  @Test
  public void convert_inputEmpty_returnsEmpty() throws Exception {
  }

  /**
   * {@link List<Tweet>} を {@link List<String>} に正しく変換できることを検証するテストケースを書こう。
   * <p>
   * ヒント: <code>isNotEmpty</code> や <code>hasSize</code> や <code>containsExactly</code> などのList用のアサーションを利用してみよう。
   */
  @Test
  public void convertList() throws Exception {
  }

  /**
   * {@link List<Tweet>} が空リストの場合 {@link List<String>} も空リストになることを検証しよう。
   */
  @Test
  public void convertList_inputEmptyList_returnsEmptyList() throws Exception {
  }

}