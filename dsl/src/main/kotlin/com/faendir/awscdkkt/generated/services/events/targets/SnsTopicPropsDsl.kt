package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.SnsTopicProps

@Generated
public fun buildSnsTopicProps(initializer: @AwsCdkDsl SnsTopicProps.Builder.() -> Unit = {}):
    SnsTopicProps = SnsTopicProps.Builder().apply(initializer).build()
