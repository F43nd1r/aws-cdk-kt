@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine
import software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps
import software.constructs.Construct

public fun Construct.cfnStorageVirtualMachine(
  id: String,
  props: CfnStorageVirtualMachineProps,
  initializer: CfnStorageVirtualMachine.() -> Unit = {},
): CfnStorageVirtualMachine = CfnStorageVirtualMachine(this, id, props).apply(initializer)
