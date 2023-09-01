package com.faendir.awscdkkt.generated.services.fsx

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine
import software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStorageVirtualMachine(
  id: String,
  props: CfnStorageVirtualMachineProps,
  initializer: @AwsCdkDsl CfnStorageVirtualMachine.() -> Unit = {},
): CfnStorageVirtualMachine = CfnStorageVirtualMachine(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStorageVirtualMachine(id: String, initializer: @AwsCdkDsl
    CfnStorageVirtualMachine.Builder.() -> Unit = {}): CfnStorageVirtualMachine =
    CfnStorageVirtualMachine.Builder.create(this, id).apply(initializer).build()
