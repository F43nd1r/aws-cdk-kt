package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnApp
import software.amazon.awscdk.services.sagemaker.CfnAppProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApp(
  id: String,
  props: CfnAppProps,
  initializer: CfnApp.() -> Unit = {},
): CfnApp = CfnApp(this, id, props).apply(initializer)
