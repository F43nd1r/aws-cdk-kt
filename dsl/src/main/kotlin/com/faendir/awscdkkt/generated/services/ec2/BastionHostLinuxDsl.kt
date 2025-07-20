package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.BastionHostLinux
import software.amazon.awscdk.services.ec2.BastionHostLinuxProps
import software.constructs.Construct

@Generated
public fun Construct.bastionHostLinux(
  id: String,
  props: BastionHostLinuxProps,
  initializer: @AwsCdkDsl BastionHostLinux.() -> Unit = {},
): BastionHostLinux = BastionHostLinux(this, id, props).apply(initializer)

@Generated
public fun Construct.buildBastionHostLinux(id: String, initializer: @AwsCdkDsl BastionHostLinux.Builder.() -> Unit = {}): BastionHostLinux = BastionHostLinux.Builder.create(this, id).apply(initializer).build()
