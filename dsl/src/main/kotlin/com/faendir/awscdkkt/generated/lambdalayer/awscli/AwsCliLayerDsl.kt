package com.faendir.awscdkkt.generated.lambdalayer.awscli

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.lambdalayer.awscli.AwsCliLayer
import software.constructs.Construct

@Generated
public fun Construct.awsCliLayer(id: String): AwsCliLayer = AwsCliLayer(this, id)

@Generated
public fun Construct.awsCliLayer(id: String, initializer: @AwsCdkDsl AwsCliLayer.() -> Unit):
    AwsCliLayer = AwsCliLayer(this, id).apply(initializer)
