package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService

@Generated
public fun buildInterfaceVpcEndpointAwsService(name: String, initializer: @AwsCdkDsl InterfaceVpcEndpointAwsService.Builder.() -> Unit = {}): InterfaceVpcEndpointAwsService = InterfaceVpcEndpointAwsService.Builder.create(name).apply(initializer).build()

@Generated
public fun buildInterfaceVpcEndpointAwsService(
  name: String,
  prefix: String,
  initializer: @AwsCdkDsl InterfaceVpcEndpointAwsService.Builder.() -> Unit = {},
): InterfaceVpcEndpointAwsService = InterfaceVpcEndpointAwsService.Builder.create(name, prefix).apply(initializer).build()

@Generated
public fun buildInterfaceVpcEndpointAwsService(
  name: String,
  prefix: String,
  port: Number,
  initializer: @AwsCdkDsl InterfaceVpcEndpointAwsService.Builder.() -> Unit = {},
): InterfaceVpcEndpointAwsService = InterfaceVpcEndpointAwsService.Builder.create(name, prefix, port).apply(initializer).build()
