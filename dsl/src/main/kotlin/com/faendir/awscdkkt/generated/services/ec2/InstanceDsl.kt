package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.Instance
import software.amazon.awscdk.services.ec2.InstanceProps
import software.constructs.Construct

@Generated
public fun Construct.instance(
  id: String,
  props: InstanceProps,
  initializer: @AwsCdkDsl Instance.() -> Unit = {},
): Instance = Instance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildInstance(id: String, initializer: @AwsCdkDsl Instance.Builder.() -> Unit =
    {}): Instance = Instance.Builder.create(this, id).apply(initializer).build()
