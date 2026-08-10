package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnResourceScan
import software.amazon.awscdk.services.cloudformation.CfnResourceScanProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceScan(id: String, initializer: @AwsCdkDsl CfnResourceScan.() -> Unit = {}): CfnResourceScan = CfnResourceScan(this, id).apply(initializer)

@Generated
public fun Construct.cfnResourceScan(
  id: String,
  props: CfnResourceScanProps,
  initializer: @AwsCdkDsl CfnResourceScan.() -> Unit = {},
): CfnResourceScan = CfnResourceScan(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResourceScan(id: String, initializer: @AwsCdkDsl CfnResourceScan.Builder.() -> Unit = {}): CfnResourceScan = CfnResourceScan.Builder.create(this, id).apply(initializer).build()
