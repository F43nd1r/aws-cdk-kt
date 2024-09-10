package com.faendir.awscdkkt.generated.services.ssmquicksetup

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager
import software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManagerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfigurationManager(
  id: String,
  props: CfnConfigurationManagerProps,
  initializer: @AwsCdkDsl CfnConfigurationManager.() -> Unit = {},
): CfnConfigurationManager = CfnConfigurationManager(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConfigurationManager(id: String, initializer: @AwsCdkDsl
    CfnConfigurationManager.Builder.() -> Unit = {}): CfnConfigurationManager =
    CfnConfigurationManager.Builder.create(this, id).apply(initializer).build()
