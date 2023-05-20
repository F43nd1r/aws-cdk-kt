@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
