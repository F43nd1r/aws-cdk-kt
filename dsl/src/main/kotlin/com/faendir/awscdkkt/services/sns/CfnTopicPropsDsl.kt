package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.CfnTopicProps

@Generated
public fun cfnTopicProps(initializer: CfnTopicProps.Builder.() -> Unit = {}): CfnTopicProps =
    CfnTopicProps.builder().apply(initializer).build()
