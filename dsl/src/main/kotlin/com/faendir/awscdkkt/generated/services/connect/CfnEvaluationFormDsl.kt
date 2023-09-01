package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnEvaluationForm
import software.amazon.awscdk.services.connect.CfnEvaluationFormProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEvaluationForm(
  id: String,
  props: CfnEvaluationFormProps,
  initializer: @AwsCdkDsl CfnEvaluationForm.() -> Unit = {},
): CfnEvaluationForm = CfnEvaluationForm(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEvaluationForm(id: String, initializer: @AwsCdkDsl
    CfnEvaluationForm.Builder.() -> Unit = {}): CfnEvaluationForm =
    CfnEvaluationForm.Builder.create(this, id).apply(initializer).build()
