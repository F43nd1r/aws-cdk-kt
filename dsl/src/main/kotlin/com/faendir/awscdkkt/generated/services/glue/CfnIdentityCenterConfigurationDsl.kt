package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnIdentityCenterConfiguration
import software.amazon.awscdk.services.glue.CfnIdentityCenterConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIdentityCenterConfiguration(
  id: String,
  props: CfnIdentityCenterConfigurationProps,
  initializer: @AwsCdkDsl CfnIdentityCenterConfiguration.() -> Unit = {},
): CfnIdentityCenterConfiguration = CfnIdentityCenterConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIdentityCenterConfiguration(id: String, initializer: @AwsCdkDsl CfnIdentityCenterConfiguration.Builder.() -> Unit = {}): CfnIdentityCenterConfiguration = CfnIdentityCenterConfiguration.Builder.create(this, id).apply(initializer).build()
