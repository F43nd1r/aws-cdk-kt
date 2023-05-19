@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
