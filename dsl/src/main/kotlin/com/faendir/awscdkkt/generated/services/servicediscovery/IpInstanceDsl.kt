package com.faendir.awscdkkt.generated.services.servicediscovery

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.IpInstance
import software.amazon.awscdk.services.servicediscovery.IpInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.ipInstance(
  id: String,
  props: IpInstanceProps,
  initializer: @AwsCdkDsl IpInstance.() -> Unit = {},
): IpInstance = IpInstance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildIpInstance(id: String, initializer: @AwsCdkDsl IpInstance.Builder.() -> Unit = {}): IpInstance = IpInstance.Builder.create(this, id).apply(initializer).build()
