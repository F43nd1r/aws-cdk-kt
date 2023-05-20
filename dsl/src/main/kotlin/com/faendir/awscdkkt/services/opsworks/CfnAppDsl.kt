@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnApp
import software.amazon.awscdk.services.opsworks.CfnAppProps
import software.constructs.Construct

public fun Construct.cfnApp(
  id: String,
  props: CfnAppProps,
  initializer: CfnApp.() -> Unit = {},
): CfnApp = CfnApp(this, id, props).apply(initializer)
