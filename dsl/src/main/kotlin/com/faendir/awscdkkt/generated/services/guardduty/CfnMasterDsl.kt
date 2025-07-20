package com.faendir.awscdkkt.generated.services.guardduty

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnMaster
import software.amazon.awscdk.services.guardduty.CfnMasterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMaster(
  id: String,
  props: CfnMasterProps,
  initializer: @AwsCdkDsl CfnMaster.() -> Unit = {},
): CfnMaster = CfnMaster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMaster(id: String, initializer: @AwsCdkDsl CfnMaster.Builder.() -> Unit = {}): CfnMaster = CfnMaster.Builder.create(this, id).apply(initializer).build()
