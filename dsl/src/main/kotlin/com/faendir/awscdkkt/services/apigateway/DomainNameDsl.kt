@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
