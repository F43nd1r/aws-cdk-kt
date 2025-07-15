package com.faendir.awscdkkt.generated.services.odb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructure
import software.amazon.awscdk.services.odb.CfnCloudExadataInfrastructureProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCloudExadataInfrastructure(id: String, initializer: @AwsCdkDsl
    CfnCloudExadataInfrastructure.() -> Unit = {}): CfnCloudExadataInfrastructure =
    CfnCloudExadataInfrastructure(this, id).apply(initializer)

@Generated
public fun Construct.cfnCloudExadataInfrastructure(
  id: String,
  props: CfnCloudExadataInfrastructureProps,
  initializer: @AwsCdkDsl CfnCloudExadataInfrastructure.() -> Unit = {},
): CfnCloudExadataInfrastructure = CfnCloudExadataInfrastructure(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCloudExadataInfrastructure(id: String, initializer: @AwsCdkDsl
    CfnCloudExadataInfrastructure.Builder.() -> Unit = {}): CfnCloudExadataInfrastructure =
    CfnCloudExadataInfrastructure.Builder.create(this, id).apply(initializer).build()
