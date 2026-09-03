package com.faendir.awscdkkt.generated.services.ssm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnServiceSetting
import software.amazon.awscdk.services.ssm.CfnServiceSettingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServiceSetting(
  id: String,
  props: CfnServiceSettingProps,
  initializer: @AwsCdkDsl CfnServiceSetting.() -> Unit = {},
): CfnServiceSetting = CfnServiceSetting(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnServiceSetting(id: String, initializer: @AwsCdkDsl CfnServiceSetting.Builder.() -> Unit = {}): CfnServiceSetting = CfnServiceSetting.Builder.create(this, id).apply(initializer).build()
