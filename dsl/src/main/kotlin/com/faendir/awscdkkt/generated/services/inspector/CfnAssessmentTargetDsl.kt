package com.faendir.awscdkkt.generated.services.inspector

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.inspector.CfnAssessmentTarget
import software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAssessmentTarget(id: String, initializer: @AwsCdkDsl CfnAssessmentTarget.() -> Unit = {}): CfnAssessmentTarget = CfnAssessmentTarget(this, id).apply(initializer)

@Generated
public fun Construct.cfnAssessmentTarget(
  id: String,
  props: CfnAssessmentTargetProps,
  initializer: @AwsCdkDsl CfnAssessmentTarget.() -> Unit = {},
): CfnAssessmentTarget = CfnAssessmentTarget(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAssessmentTarget(id: String, initializer: @AwsCdkDsl CfnAssessmentTarget.Builder.() -> Unit = {}): CfnAssessmentTarget = CfnAssessmentTarget.Builder.create(this, id).apply(initializer).build()
