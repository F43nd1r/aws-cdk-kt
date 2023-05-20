@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.DomainName
import software.amazon.awscdk.services.apigateway.DomainNameProps
import software.constructs.Construct

public fun Construct.domainName(
  id: String,
  props: DomainNameProps,
  initializer: DomainName.() -> Unit = {},
): DomainName = DomainName(this, id, props).apply(initializer)
