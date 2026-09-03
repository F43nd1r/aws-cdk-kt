package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnHumanTaskUi
import software.amazon.awscdk.services.sagemaker.CfnHumanTaskUiProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHumanTaskUi(
  id: String,
  props: CfnHumanTaskUiProps,
  initializer: @AwsCdkDsl CfnHumanTaskUi.() -> Unit = {},
): CfnHumanTaskUi = CfnHumanTaskUi(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHumanTaskUi(id: String, initializer: @AwsCdkDsl CfnHumanTaskUi.Builder.() -> Unit = {}): CfnHumanTaskUi = CfnHumanTaskUi.Builder.create(this, id).apply(initializer).build()
