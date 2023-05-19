@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnAuthorizer
import software.amazon.awscdk.services.iot.CfnAuthorizerProps
import software.constructs.Construct

public fun Construct.cfnAuthorizer(
  id: String,
  props: CfnAuthorizerProps,
  initializer: CfnAuthorizer.() -> Unit = {},
): CfnAuthorizer = CfnAuthorizer(this, id, props).apply(initializer)
