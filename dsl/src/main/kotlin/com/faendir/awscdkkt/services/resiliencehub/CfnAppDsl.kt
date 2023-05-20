@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.resiliencehub

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.resiliencehub.CfnApp
import software.amazon.awscdk.services.resiliencehub.CfnAppProps
import software.constructs.Construct

public fun Construct.cfnApp(
  id: String,
  props: CfnAppProps,
  initializer: CfnApp.() -> Unit = {},
): CfnApp = CfnApp(this, id, props).apply(initializer)
