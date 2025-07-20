package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusion
import software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPCBlockPublicAccessExclusion(
  id: String,
  props: CfnVPCBlockPublicAccessExclusionProps,
  initializer: @AwsCdkDsl CfnVPCBlockPublicAccessExclusion.() -> Unit = {},
): CfnVPCBlockPublicAccessExclusion = CfnVPCBlockPublicAccessExclusion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVPCBlockPublicAccessExclusion(id: String, initializer: @AwsCdkDsl CfnVPCBlockPublicAccessExclusion.Builder.() -> Unit = {}): CfnVPCBlockPublicAccessExclusion = CfnVPCBlockPublicAccessExclusion.Builder.create(this, id).apply(initializer).build()
