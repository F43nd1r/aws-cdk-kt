package com.faendir.awscdkkt.generated.services.lookoutequipment

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInferenceScheduler(id: String, props: CfnInferenceSchedulerProps):
    CfnInferenceScheduler = CfnInferenceScheduler(this, id, props)

@Generated
public fun Construct.cfnInferenceScheduler(
  id: String,
  props: CfnInferenceSchedulerProps,
  initializer: @AwsCdkDsl CfnInferenceScheduler.() -> Unit,
): CfnInferenceScheduler = CfnInferenceScheduler(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInferenceScheduler(id: String, initializer: @AwsCdkDsl
    CfnInferenceScheduler.Builder.() -> Unit): CfnInferenceScheduler =
    CfnInferenceScheduler.Builder.create(this, id).apply(initializer).build()
