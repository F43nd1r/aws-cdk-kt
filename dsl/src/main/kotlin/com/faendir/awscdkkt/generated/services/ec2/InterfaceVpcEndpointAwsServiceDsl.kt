package com.faendir.awscdkkt.generated.services.ec2

import javax.`annotation`.Generated
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService

@Generated
public fun interfaceVpcEndpointAwsService(name: String, prefix: String):
    InterfaceVpcEndpointAwsService = InterfaceVpcEndpointAwsService(name, prefix)

@Generated
public fun interfaceVpcEndpointAwsService(name: String): InterfaceVpcEndpointAwsService =
    InterfaceVpcEndpointAwsService(name)

@Generated
public fun interfaceVpcEndpointAwsService(
  name: String,
  prefix: String,
  port: Number,
): InterfaceVpcEndpointAwsService = InterfaceVpcEndpointAwsService(name, prefix, port)
