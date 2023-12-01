package com.faendir.awscdkkt.generated.services.backupgateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backupgateway.CfnHypervisor
import software.amazon.awscdk.services.backupgateway.CfnHypervisorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHypervisor(id: String, initializer: @AwsCdkDsl CfnHypervisor.() -> Unit =
    {}): CfnHypervisor = CfnHypervisor(this, id).apply(initializer)

@Generated
public fun Construct.cfnHypervisor(
  id: String,
  props: CfnHypervisorProps,
  initializer: @AwsCdkDsl CfnHypervisor.() -> Unit = {},
): CfnHypervisor = CfnHypervisor(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHypervisor(id: String, initializer: @AwsCdkDsl
    CfnHypervisor.Builder.() -> Unit = {}): CfnHypervisor = CfnHypervisor.Builder.create(this,
    id).apply(initializer).build()
