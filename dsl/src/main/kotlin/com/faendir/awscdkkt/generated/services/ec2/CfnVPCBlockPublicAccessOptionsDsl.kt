package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessOptions
import software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessOptionsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPCBlockPublicAccessOptions(
  id: String,
  props: CfnVPCBlockPublicAccessOptionsProps,
  initializer: @AwsCdkDsl CfnVPCBlockPublicAccessOptions.() -> Unit = {},
): CfnVPCBlockPublicAccessOptions = CfnVPCBlockPublicAccessOptions(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnVPCBlockPublicAccessOptions(id: String, initializer: @AwsCdkDsl
    CfnVPCBlockPublicAccessOptions.Builder.() -> Unit = {}): CfnVPCBlockPublicAccessOptions =
    CfnVPCBlockPublicAccessOptions.Builder.create(this, id).apply(initializer).build()
