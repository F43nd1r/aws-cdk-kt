@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
