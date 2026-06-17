package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMlflowApp
import software.amazon.awscdk.services.sagemaker.CfnMlflowAppProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMlflowApp(
  id: String,
  props: CfnMlflowAppProps,
  initializer: @AwsCdkDsl CfnMlflowApp.() -> Unit = {},
): CfnMlflowApp = CfnMlflowApp(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMlflowApp(id: String, initializer: @AwsCdkDsl CfnMlflowApp.Builder.() -> Unit = {}): CfnMlflowApp = CfnMlflowApp.Builder.create(this, id).apply(initializer).build()
