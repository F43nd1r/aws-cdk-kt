@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnDomainName
import software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps
import software.constructs.Construct

public fun Construct.cfnDomainName(
  id: String,
  props: CfnDomainNameProps,
  initializer: CfnDomainName.() -> Unit = {},
): CfnDomainName = CfnDomainName(this, id, props).apply(initializer)
