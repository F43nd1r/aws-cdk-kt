package com.faendir.awscdkkt.generated.services.codepipeline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.Trigger

@Generated
public fun buildTrigger(initializer: @AwsCdkDsl Trigger.Builder.() -> Unit = {}): Trigger = Trigger.Builder.create().apply(initializer).build()
