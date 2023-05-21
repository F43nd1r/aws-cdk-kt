package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.SnsTopicProps

@Generated
public fun snsTopicProps(initializer: SnsTopicProps.Builder.() -> Unit = {}): SnsTopicProps =
    SnsTopicProps.builder().apply(initializer).build()
