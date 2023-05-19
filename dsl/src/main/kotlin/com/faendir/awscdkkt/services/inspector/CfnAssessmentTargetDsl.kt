@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.inspector

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.inspector.CfnAssessmentTarget
import software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps
import software.constructs.Construct

public fun Construct.cfnAssessmentTarget(id: String, initializer: CfnAssessmentTarget.() -> Unit =
    {}): CfnAssessmentTarget = CfnAssessmentTarget(this, id).apply(initializer)

public fun Construct.cfnAssessmentTarget(
  id: String,
  props: CfnAssessmentTargetProps,
  initializer: CfnAssessmentTarget.() -> Unit = {},
): CfnAssessmentTarget = CfnAssessmentTarget(this, id, props).apply(initializer)
