@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnDomainName
import software.amazon.awscdk.services.apigateway.CfnDomainNameProps
import software.constructs.Construct

public fun Construct.cfnDomainName(id: String, initializer: CfnDomainName.() -> Unit = {}):
    CfnDomainName = CfnDomainName(this, id).apply(initializer)

public fun Construct.cfnDomainName(
  id: String,
  props: CfnDomainNameProps,
  initializer: CfnDomainName.() -> Unit = {},
): CfnDomainName = CfnDomainName(this, id, props).apply(initializer)
