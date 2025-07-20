package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion
import software.amazon.awscdk.services.rds.CfnCustomDBEngineVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCustomDBEngineVersion(
  id: String,
  props: CfnCustomDBEngineVersionProps,
  initializer: @AwsCdkDsl CfnCustomDBEngineVersion.() -> Unit = {},
): CfnCustomDBEngineVersion = CfnCustomDBEngineVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCustomDBEngineVersion(id: String, initializer: @AwsCdkDsl CfnCustomDBEngineVersion.Builder.() -> Unit = {}): CfnCustomDBEngineVersion = CfnCustomDBEngineVersion.Builder.create(this, id).apply(initializer).build()
