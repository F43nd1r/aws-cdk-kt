package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCEncryptionControl
import software.amazon.awscdk.services.ec2.CfnVPCEncryptionControlProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPCEncryptionControl(id: String, initializer: @AwsCdkDsl CfnVPCEncryptionControl.() -> Unit = {}): CfnVPCEncryptionControl = CfnVPCEncryptionControl(this, id).apply(initializer)

@Generated
public fun Construct.cfnVPCEncryptionControl(
  id: String,
  props: CfnVPCEncryptionControlProps,
  initializer: @AwsCdkDsl CfnVPCEncryptionControl.() -> Unit = {},
): CfnVPCEncryptionControl = CfnVPCEncryptionControl(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVPCEncryptionControl(id: String, initializer: @AwsCdkDsl CfnVPCEncryptionControl.Builder.() -> Unit = {}): CfnVPCEncryptionControl = CfnVPCEncryptionControl.Builder.create(this, id).apply(initializer).build()
