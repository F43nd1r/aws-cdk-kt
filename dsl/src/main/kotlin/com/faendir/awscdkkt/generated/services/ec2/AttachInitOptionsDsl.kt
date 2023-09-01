package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AttachInitOptions

@Generated
public fun buildAttachInitOptions(initializer: @AwsCdkDsl AttachInitOptions.Builder.() -> Unit =
    {}): AttachInitOptions = AttachInitOptions.Builder().apply(initializer).build()
