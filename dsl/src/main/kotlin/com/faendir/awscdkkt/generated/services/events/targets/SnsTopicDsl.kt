package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.SnsTopic
import software.amazon.awscdk.services.sns.ITopic

@Generated
public fun buildSnsTopic(topic: ITopic, initializer: @AwsCdkDsl SnsTopic.Builder.() -> Unit):
    SnsTopic = SnsTopic.Builder.create(topic).apply(initializer).build()
