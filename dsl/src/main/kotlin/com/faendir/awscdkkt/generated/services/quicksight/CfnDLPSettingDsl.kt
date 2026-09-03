package com.faendir.awscdkkt.generated.services.quicksight

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDLPSetting
import software.amazon.awscdk.services.quicksight.CfnDLPSettingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDLPSetting(
  id: String,
  props: CfnDLPSettingProps,
  initializer: @AwsCdkDsl CfnDLPSetting.() -> Unit = {},
): CfnDLPSetting = CfnDLPSetting(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDLPSetting(id: String, initializer: @AwsCdkDsl CfnDLPSetting.Builder.() -> Unit = {}): CfnDLPSetting = CfnDLPSetting.Builder.create(this, id).apply(initializer).build()
