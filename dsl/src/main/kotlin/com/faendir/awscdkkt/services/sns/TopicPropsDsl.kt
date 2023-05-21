package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.TopicProps

@Generated
public fun topicProps(initializer: TopicProps.Builder.() -> Unit = {}): TopicProps =
    TopicProps.builder().apply(initializer).build()
