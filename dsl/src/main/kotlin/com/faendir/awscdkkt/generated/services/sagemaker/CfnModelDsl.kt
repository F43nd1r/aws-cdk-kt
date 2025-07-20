package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModel
import software.amazon.awscdk.services.sagemaker.CfnModelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModel(id: String, initializer: @AwsCdkDsl CfnModel.() -> Unit = {}): CfnModel = CfnModel(this, id).apply(initializer)

@Generated
public fun Construct.cfnModel(
  id: String,
  props: CfnModelProps,
  initializer: @AwsCdkDsl CfnModel.() -> Unit = {},
): CfnModel = CfnModel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnModel(id: String, initializer: @AwsCdkDsl CfnModel.Builder.() -> Unit = {}): CfnModel = CfnModel.Builder.create(this, id).apply(initializer).build()
