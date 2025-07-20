package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName
import software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps
import software.constructs.Construct

@Generated
public fun Construct.vpcEndpointServiceDomainName(
  id: String,
  props: VpcEndpointServiceDomainNameProps,
  initializer: @AwsCdkDsl VpcEndpointServiceDomainName.() -> Unit = {},
): VpcEndpointServiceDomainName = VpcEndpointServiceDomainName(this, id, props).apply(initializer)

@Generated
public fun Construct.buildVpcEndpointServiceDomainName(id: String, initializer: @AwsCdkDsl VpcEndpointServiceDomainName.Builder.() -> Unit = {}): VpcEndpointServiceDomainName = VpcEndpointServiceDomainName.Builder.create(this, id).apply(initializer).build()
