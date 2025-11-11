package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnCapacityManagerDataExport
import software.amazon.awscdk.services.ec2.CfnCapacityManagerDataExportProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCapacityManagerDataExport(
  id: String,
  props: CfnCapacityManagerDataExportProps,
  initializer: @AwsCdkDsl CfnCapacityManagerDataExport.() -> Unit = {},
): CfnCapacityManagerDataExport = CfnCapacityManagerDataExport(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCapacityManagerDataExport(id: String, initializer: @AwsCdkDsl CfnCapacityManagerDataExport.Builder.() -> Unit = {}): CfnCapacityManagerDataExport = CfnCapacityManagerDataExport.Builder.create(this, id).apply(initializer).build()
