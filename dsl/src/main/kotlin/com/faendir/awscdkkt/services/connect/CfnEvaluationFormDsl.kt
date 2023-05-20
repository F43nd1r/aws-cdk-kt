@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnEvaluationForm
import software.amazon.awscdk.services.connect.CfnEvaluationFormProps
import software.constructs.Construct

public fun Construct.cfnEvaluationForm(
  id: String,
  props: CfnEvaluationFormProps,
  initializer: CfnEvaluationForm.() -> Unit = {},
): CfnEvaluationForm = CfnEvaluationForm(this, id, props).apply(initializer)
