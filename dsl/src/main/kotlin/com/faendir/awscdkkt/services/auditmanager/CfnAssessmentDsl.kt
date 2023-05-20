@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.auditmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.auditmanager.CfnAssessment
import software.amazon.awscdk.services.auditmanager.CfnAssessmentProps
import software.constructs.Construct

public fun Construct.cfnAssessment(id: String, initializer: CfnAssessment.() -> Unit = {}):
    CfnAssessment = CfnAssessment(this, id).apply(initializer)

public fun Construct.cfnAssessment(
  id: String,
  props: CfnAssessmentProps,
  initializer: CfnAssessment.() -> Unit = {},
): CfnAssessment = CfnAssessment(this, id, props).apply(initializer)
