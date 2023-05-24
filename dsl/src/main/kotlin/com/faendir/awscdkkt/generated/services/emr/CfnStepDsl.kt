package com.faendir.awscdkkt.generated.services.emr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnStep
import software.amazon.awscdk.services.emr.CfnStepProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStep(id: String, props: CfnStepProps): CfnStep = CfnStep(this, id, props)

@Generated
public fun Construct.cfnStep(
  id: String,
  props: CfnStepProps,
  initializer: @AwsCdkDsl CfnStep.() -> Unit,
): CfnStep = CfnStep(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStep(id: String, initializer: @AwsCdkDsl CfnStep.Builder.() -> Unit):
    CfnStep = CfnStep.Builder.create(this, id).apply(initializer).build()
