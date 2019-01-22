package behavioral._01_chainofresponsibility;

import lombok.Setter;

@Setter
public abstract class AbstractHandler implements Handler {

    AbstractHandler successor;

}