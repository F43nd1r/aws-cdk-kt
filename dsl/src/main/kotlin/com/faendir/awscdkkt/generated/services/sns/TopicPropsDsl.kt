package com.faendir.awscdkkt.generated.services.sns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.TopicProps

@Generated
public fun buildTopicProps(initializer: @AwsCdkDsl TopicProps.Builder.() -> Unit = {}): TopicProps =
    TopicProps.Builder().apply(initializer).build()
