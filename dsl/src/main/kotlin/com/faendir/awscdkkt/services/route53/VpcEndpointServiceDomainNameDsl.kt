@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName
import software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps
import software.constructs.Construct

public fun Construct.vpcEndpointServiceDomainName(
  id: String,
  props: VpcEndpointServiceDomainNameProps,
  initializer: VpcEndpointServiceDomainName.() -> Unit = {},
): VpcEndpointServiceDomainName = VpcEndpointServiceDomainName(this, id, props).apply(initializer)
