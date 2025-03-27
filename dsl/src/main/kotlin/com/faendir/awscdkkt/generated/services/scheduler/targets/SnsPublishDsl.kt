package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.targets.SnsPublish
import software.amazon.awscdk.services.sns.ITopic

@Generated
public fun buildSnsPublish(topic: ITopic, initializer: @AwsCdkDsl SnsPublish.Builder.() -> Unit =
    {}): SnsPublish = SnsPublish.Builder.create(topic).apply(initializer).build()
